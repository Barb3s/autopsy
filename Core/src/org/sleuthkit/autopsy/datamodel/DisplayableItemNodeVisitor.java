/*
 * Autopsy Forensic Browser
 * 
 * Copyright 2011 - 2013 Basis Technology Corp.
 * Contact: carrier <at> sleuthkit <dot> org
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sleuthkit.autopsy.datamodel;

import org.sleuthkit.autopsy.datamodel.DeletedContent.DeletedContentsChildren.DeletedContentNode;
import org.sleuthkit.autopsy.datamodel.DeletedContent.DeletedContentsNode;
import org.sleuthkit.autopsy.datamodel.FileSize.FileSizeRootChildren.FileSizeNode;
import org.sleuthkit.autopsy.datamodel.FileSize.FileSizeRootNode;

/**
 * Visitor pattern implementation for DisplayableItemNodes
 */
public interface DisplayableItemNodeVisitor<T> {

    T visit(DirectoryNode dn);

    T visit(FileNode fn);

    T visit(ImageNode in);

    T visit(VolumeNode vn);

    T visit(BlackboardArtifactNode ban);

    T visit(ExtractedContent.TypeNode atn);

    T visit(ExtractedContent.RootNode ecn);

    T visit(FileTypeNode fsfn);

    T visit(DeletedContentNode dcn);

    T visit(DeletedContentsNode dcn);

    T visit(FileSizeRootNode fsrn);

    T visit(FileSizeNode fsn);

    T visit(FileTypesNode sfn);

    T visit(RecentFilesNode rfn);

    T visit(RecentFilesFilterNode rffn);

    T visit(KeywordHits.RootNode khrn);

    T visit(KeywordHits.ListNode khsn);

    T visit(KeywordHits.TermNode khmln);

    T visit(HashsetHits.RootNode hhrn);

    T visit(HashsetHits.HashsetNameNode hhsn);

    T visit(EmailExtracted.RootNode eern);

    T visit(EmailExtracted.AccountNode eean);

    T visit(EmailExtracted.FolderNode eefn);

    T visit(Tags.RootNode node);
    
    T visit(InterestingHits.RootNode ihrn);

    T visit(InterestingHits.SetNameNode ihsn);
    
    T visit(Tags.TagNameNode node);

    T visit(Tags.ContentTagTypeNode node);    

    T visit(ContentTagNode node);
        
    T visit(Tags.BlackboardArtifactTagTypeNode node);

    T visit(BlackboardArtifactTagNode node);    

    T visit(ViewsNode vn);

    T visit(ResultsNode rn);

    T visit(DataSourcesNode in);

    T visit(LayoutFileNode lfn);

    T visit(LocalFileNode dfn);

    T visit(VirtualDirectoryNode ldn);

    T visit(Reports.ReportsListNode reportsNode);

    T visit(Reports.ReportNode reportNode);
        
    /**
     * Visitor with an implementable default behavior for all types. Override
     * specific visit types to not use the default behavior.
     *
     * @param <T>
     */
    static abstract class Default<T> implements DisplayableItemNodeVisitor<T> {

        /**
         * Default visit for all types
         *
         * @param c
         * @return
         */
        protected abstract T defaultVisit(DisplayableItemNode c);

        @Override
        public T visit(DirectoryNode dn) {
            return defaultVisit(dn);
        }

        @Override
        public T visit(FileNode fn) {
            return defaultVisit(fn);
        }

        @Override
        public T visit(ImageNode in) {
            return defaultVisit(in);
        }

        @Override
        public T visit(VolumeNode vn) {
            return defaultVisit(vn);
        }

        @Override
        public T visit(BlackboardArtifactNode ban) {
            return defaultVisit(ban);
        }

        @Override
        public T visit(ExtractedContent.TypeNode atn) {
            return defaultVisit(atn);
        }

        @Override
        public T visit(ExtractedContent.RootNode ecn) {
            return defaultVisit(ecn);
        }

        @Override
        public T visit(FileTypeNode fsfn) {
            return defaultVisit(fsfn);
        }

        @Override
        public T visit(DeletedContentNode dcn) {
            return defaultVisit(dcn);
        }

        @Override
        public T visit(DeletedContentsNode dcn) {
            return defaultVisit(dcn);
        }

        @Override
        public T visit(FileSizeRootNode fsrn) {
            return defaultVisit(fsrn);
        }

        @Override
        public T visit(FileSizeNode fsn) {
            return defaultVisit(fsn);
        }

        @Override
        public T visit(FileTypesNode sfn) {
            return defaultVisit(sfn);
        }

        @Override
        public T visit(RecentFilesNode rfn) {
            return defaultVisit(rfn);
        }

        @Override
        public T visit(RecentFilesFilterNode rffn) {
            return defaultVisit(rffn);
        }

        @Override
        public T visit(KeywordHits.RootNode khrn) {
            return defaultVisit(khrn);
        }

        @Override
        public T visit(KeywordHits.ListNode khsn) {
            return defaultVisit(khsn);
        }

        @Override
        public T visit(KeywordHits.TermNode khmln) {
            return defaultVisit(khmln);
        }

        @Override
        public T visit(ViewsNode vn) {
            return defaultVisit(vn);
        }

        @Override
        public T visit(ResultsNode rn) {
            return defaultVisit(rn);
        }

        @Override
        public T visit(DataSourcesNode in) {
            return defaultVisit(in);
        }

        @Override
        public T visit(HashsetHits.RootNode hhrn) {
            return defaultVisit(hhrn);
        }

        @Override
        public T visit(HashsetHits.HashsetNameNode hhsn) {
            return defaultVisit(hhsn);
        }
        
         @Override
        public T visit(InterestingHits.RootNode ihrn) {
            return defaultVisit(ihrn);
        }

        @Override
        public T visit(InterestingHits.SetNameNode ihsn) {
            return defaultVisit(ihsn);
        }
        
        @Override
        public T visit(EmailExtracted.RootNode eern) {
            return defaultVisit(eern);
        }

        @Override
        public T visit(EmailExtracted.AccountNode eean) {
            return defaultVisit(eean);
        }

        @Override
        public T visit(EmailExtracted.FolderNode eefn) {
            return defaultVisit(eefn);
        }

        @Override
        public T visit(LayoutFileNode lfn) {
            return defaultVisit(lfn);
        }

        @Override
        public T visit(LocalFileNode dfn) {
            return defaultVisit(dfn);
        }

        @Override
        public T visit(VirtualDirectoryNode ldn) {
            return defaultVisit(ldn);
        }

        @Override
        public T visit(Tags.RootNode node) {
            return defaultVisit(node);
        }

        @Override
        public T visit(Tags.TagNameNode node) {
            return defaultVisit(node);
        }

        @Override
        public T visit(Tags.ContentTagTypeNode node) {
            return defaultVisit(node);
        }

        @Override
        public T visit(ContentTagNode node) {
            return defaultVisit(node);
        }
        
        @Override
        public T visit(Tags.BlackboardArtifactTagTypeNode node) {
            return defaultVisit(node);
        }

        @Override
        public T visit(BlackboardArtifactTagNode node) {
            return defaultVisit(node);
        }

        @Override
        public T visit(Reports.ReportsListNode node) {
            return defaultVisit(node);
        }

        @Override
        public T visit(Reports.ReportNode node) {
            return defaultVisit(node);
        }
    }
}
